package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {
    private static final Log log = LogFactory.getLog(AWSCredentialsProviderChain.class);
    private AWSCredentialsProvider lastUsedProvider;
    private List<AWSCredentialsProvider> credentialsProviders = new LinkedList();
    private boolean reuseLastProvider = true;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr != null && aWSCredentialsProviderArr.length != 0) {
            for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
                this.credentialsProviders.add(aWSCredentialsProvider);
            }
            return;
        }
        throw new IllegalArgumentException("No credential providers specified");
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        AWSCredentialsProvider aWSCredentialsProvider;
        if (this.reuseLastProvider && (aWSCredentialsProvider = this.lastUsedProvider) != null) {
            return aWSCredentialsProvider.getCredentials();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.credentialsProviders) {
            try {
                AWSCredentials credentials = aWSCredentialsProvider2.getCredentials();
                if (credentials.getAWSAccessKeyId() != null && credentials.getAWSSecretKey() != null) {
                    Log log2 = log;
                    log2.debug("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.lastUsedProvider = aWSCredentialsProvider2;
                    return credentials;
                }
            } catch (Exception e) {
                Log log3 = log;
                log3.debug("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }

    public boolean getReuseLastProvider() {
        return this.reuseLastProvider;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
        for (AWSCredentialsProvider aWSCredentialsProvider : this.credentialsProviders) {
            aWSCredentialsProvider.refresh();
        }
    }

    public void setReuseLastProvider(boolean z) {
        this.reuseLastProvider = z;
    }
}
