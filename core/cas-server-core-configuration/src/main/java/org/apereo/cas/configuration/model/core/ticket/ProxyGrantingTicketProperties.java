package org.apereo.cas.configuration.model.core.ticket;

import java.io.Serializable;

/**
 * This is {@link ProxyGrantingTicketProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */

public class ProxyGrantingTicketProperties implements Serializable {
    private static final long serialVersionUID = 8478961497316814687L;
    /**
     * Maximum length of the proxy granting ticket, when generating one.
     */
    private int maxLength = 50;

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(final int maxLength) {
        this.maxLength = maxLength;
    }
}
