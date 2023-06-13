package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.File;
import java.io.IOException;
/* loaded from: classes2.dex */
public class PropertiesFileCredentialsProvider implements AWSCredentialsProvider {
    private final String credentialsFilePath;

    public PropertiesFileCredentialsProvider(String str) {
        if (str != null) {
            this.credentialsFilePath = str;
            return;
        }
        throw new IllegalArgumentException("Credentials file path cannot be null");
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        try {
            return new PropertiesCredentials(new File(this.credentialsFilePath));
        } catch (IOException e) {
            throw new AmazonClientException("Unable to load AWS credentials from the " + this.credentialsFilePath + " file", e);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.credentialsFilePath + ")";
    }
}
