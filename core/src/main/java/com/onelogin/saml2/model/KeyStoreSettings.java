package com.onelogin.saml2.model;

import java.security.KeyStore;

/**
 * KeyStore class of OneLogin's Java Toolkit.
 *
 * A class that stores KeyStore details for Certificates and Private Key
 */
public class KeyStoreSettings {
    /**
     * KeyStore which stores certificates and key
     */
    private final KeyStore keyStore;

    /**
     * Alias for SP key entry
     */
    private final String spAlias;

    /**
     * Password for KeyStore
     */
    private final String storePass;

    /**
     * Password for Private Key Entry in the KeyStore
     */
    private final String spKeyPass;

    /**
     * Constructor
     *
     * @param keyStore
     *            stores certificates and key
     * 
     * @param spAlias
     *            Alias for SP key entry
     *
     * @param storePass
     *            password to access KeyStore
     *
     * @param spKeyPass
     *            password to access private key in KeyStore
     */
    public KeyStoreSettings(KeyStore keyStore, String spAlias, String storePass, String spKeyPass) {
        this.keyStore = keyStore;
        this.spAlias = spAlias;
        this.storePass = storePass;
        this.spKeyPass = spKeyPass;
    }

    /**
     * @return the keyStore
     */
    public final KeyStore getKeyStore() {
        return keyStore;
    }

    /**
     * @return the spAlias
     */
    public final String getSpAlias() {
        return spAlias;
    }

    /**
     * @return the storePass
     */
    public final String getStorePass() {
        return storePass;
    }

    /**
     * @return the password for private key entry in KeyStore
     */
    public final String getSpKeyPass() {
        return spKeyPass;
    }
}