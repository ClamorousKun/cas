package org.apereo.cas.configuration.model.core.authentication;

import org.apereo.cas.configuration.support.RequiresModule;

import java.io.Serializable;

/**
 * This is {@link PrincipalTransformationProperties}.
 *  Transform the user id prior to executing the authentication sequence.
 *  Each authentication strategy in CAS provides settings to properly transform
 *  the principal. Refer to the relevant settings for the authentication strategy at hand to learn more.
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-core-authentication", automated = true)
public class PrincipalTransformationProperties implements Serializable {

    private static final long serialVersionUID = 1678602647607236322L;

    public enum CaseConversion {
        /** No conversion. */
        NONE,
        /** Lowercase conversion. */
        UPPERCASE,
        /** Uppcase conversion. */
        LOWERCASE,
    }

    /**
     * Prefix to add to the principal id prior to authentication.
     */
    private String prefix;

    /**
     * Suffix to add to the principal id prior to authentication.
     */
    private String suffix;

    /**
     * Indicate whether the principal identifier should be transformed
     * into upper-case, lower-case, etc.
     * Accepted values are {@code NONE, UPPERCASE, LOWERCASE},
     */
    private CaseConversion caseConversion = CaseConversion.NONE;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(final String suffix) {
        this.suffix = suffix;
    }

    public CaseConversion getCaseConversion() {
        return caseConversion;
    }

    public void setCaseConversion(final CaseConversion caseConversion) {
        this.caseConversion = caseConversion;
    }
}
