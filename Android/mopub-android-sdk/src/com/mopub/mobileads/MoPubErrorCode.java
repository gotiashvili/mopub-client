package com.mopub.mobileads;

public enum MoPubErrorCode {
    NO_FILL("No inventory."),
    SERVER_ERROR("Unable to connect to MoPub adserver."),
    INTERNAL_ERROR("Unable to serve ad due to invalid internal state."),
    CANCELLED("Ad request was cancelled."),
    
    ADAPTER_NOT_FOUND("Unable to find Native Network or Custom Event adapter."),
    ADAPTER_CONFIGURATION_ERROR("Native Network or Custom Event adapter was configured incorrectly."),
    NETWORK_NO_FILL("Third-party network failed to provide inventory."),
    NETWORK_INVALID_STATE("Third-party network failed due to invalid internal state."),
    MRAID_LOAD_ERROR("Error loading MRAID ad."),
    
    UNSPECIFIED("Unspecified error.");
    
    private final String message;
    
    private MoPubErrorCode(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return this.message;
    }
}
