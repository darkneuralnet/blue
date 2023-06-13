package com.amazonaws.util;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public class HttpUtils {
    private static final Pattern DECODED_CHARACTERS_PATTERN;
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Pattern ENCODED_CHARACTERS_PATTERN = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));
    private static final int HTTP_STATUS_OK = 200;
    private static final int PORT_HTTP = 80;
    private static final int PORT_HTTPS = 443;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("%2A"));
        sb.append("|");
        sb.append(Pattern.quote("%2B"));
        sb.append("|");
        DECODED_CHARACTERS_PATTERN = Pattern.compile(sb.toString());
    }

    public static String appendUri(String str, String str2) {
        return appendUri(str, str2, false);
    }

    public static String encodeParameters(Request<?> request) {
        String encode;
        if (request.getParameters().isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry<String, String> entry : request.getParameters().entrySet()) {
                String encode2 = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = entry.getValue();
                if (value == null) {
                    encode = "";
                } else {
                    encode = URLEncoder.encode(value, "UTF-8");
                }
                if (!z) {
                    sb.append("&");
                } else {
                    z = false;
                }
                sb.append(encode2);
                sb.append("=");
                sb.append(encode);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static InputStream fetchFile(URI uri, ClientConfiguration clientConfiguration) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uri.toURL().openConnection()));
        httpURLConnection.setConnectTimeout(getConnectionTimeout(clientConfiguration));
        httpURLConnection.setReadTimeout(getSocketTimeout(clientConfiguration));
        httpURLConnection.addRequestProperty("User-Agent", getUserAgent(clientConfiguration));
        if (httpURLConnection.getResponseCode() != 200) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
            httpURLConnection.disconnect();
            throw new IOException("Error fetching file from " + uri + ": " + httpURLConnection.getResponseMessage());
        }
        return httpURLConnection.getInputStream();
    }

    public static int getConnectionTimeout(ClientConfiguration clientConfiguration) {
        if (clientConfiguration != null) {
            return clientConfiguration.getConnectionTimeout();
        }
        return 15000;
    }

    public static int getSocketTimeout(ClientConfiguration clientConfiguration) {
        if (clientConfiguration != null) {
            return clientConfiguration.getSocketTimeout();
        }
        return 15000;
    }

    public static String getUserAgent(ClientConfiguration clientConfiguration) {
        String str;
        if (clientConfiguration != null) {
            str = clientConfiguration.getUserAgent();
        } else {
            str = null;
        }
        if (str == null) {
            return ClientConfiguration.DEFAULT_USER_AGENT;
        }
        String str2 = ClientConfiguration.DEFAULT_USER_AGENT;
        if (!str2.equals(str)) {
            return str + ", " + str2;
        }
        return str;
    }

    public static boolean isUsingNonDefaultPort(URI uri) {
        String lowerCase = StringUtils.lowerCase(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if ("http".equals(lowerCase) && port == 80) {
            return false;
        }
        if ("https".equals(lowerCase) && port == PORT_HTTPS) {
            return false;
        }
        return true;
    }

    public static String urlDecode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String urlEncode(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encode);
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            while (matcher.find()) {
                String group = matcher.group(0);
                if ("+".equals(group)) {
                    group = "%20";
                } else if ("*".equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                } else if (z && "%2F".equals(group)) {
                    group = "/";
                }
                matcher.appendReplacement(stringBuffer, group);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean usePayloadForQueryParameters(Request<?> request) {
        boolean z;
        boolean equals = HttpMethodName.POST.equals(request.getHttpMethod());
        if (request.getContent() == null) {
            z = true;
        } else {
            z = false;
        }
        if (equals && z) {
            return true;
        }
        return false;
    }

    public static String appendUri(String str, String str2, boolean z) {
        if (str2 != null && str2.length() > 0) {
            if (str2.startsWith("/")) {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } else if (!str.endsWith("/")) {
                str = str + "/";
            }
            String urlEncode = urlEncode(str2, true);
            if (z) {
                urlEncode = urlEncode.replace("//", "/%2F");
            }
            return str + urlEncode;
        } else if (str.endsWith("/")) {
            return str;
        } else {
            return str + "/";
        }
    }
}
