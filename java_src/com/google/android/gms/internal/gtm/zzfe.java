package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import ch.qos.logback.classic.spi.CallerData;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Typography;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzg(URL url, byte[] bArr) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException e;
        OutputStream outputStream;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        zzH("POST bytes, url", Integer.valueOf(length), url);
        if (zzbr.zzV()) {
            zzP("Post payload\n", new String(bArr));
        }
        OutputStream outputStream2 = null;
        outputStream2 = null;
        outputStream2 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            zzo().getPackageName();
            httpURLConnection = zzb(url);
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                outputStream2 = httpURLConnection.getOutputStream();
                outputStream2.write(bArr);
                zzk(httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    zzs().zzi();
                    responseCode = 200;
                }
                zzG("POST status", Integer.valueOf(responseCode));
                try {
                    outputStream2.close();
                } catch (IOException e2) {
                    zzK("Error closing http post connection output stream", e2);
                }
                httpURLConnection.disconnect();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                OutputStream outputStream3 = outputStream2;
                httpURLConnection2 = httpURLConnection;
                outputStream = outputStream3;
                try {
                    zzS("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            zzK("Error closing http post connection output stream", e4);
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        return 0;
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    HttpURLConnection httpURLConnection3 = httpURLConnection2;
                    outputStream2 = outputStream;
                    httpURLConnection = httpURLConnection3;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e5) {
                            zzK("Error closing http post connection output stream", e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    private final URL zzh() {
        String str;
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        if (zzb.length() != 0) {
            str = zzi.concat(zzb);
        } else {
            str = new String(zzi);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String sb;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            StringBuilder sb2 = new StringBuilder(length + 1 + zzj.length() + str.length());
            sb2.append(zzi);
            sb2.append(zzj);
            sb2.append(CallerData.f61059NA);
            sb2.append(str);
            sb = sb2.toString();
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + zzj2.length() + str.length());
            sb3.append(zzk);
            sb3.append(zzj2);
            sb3.append(CallerData.f61059NA);
            sb3.append(str);
            sb = sb3.toString();
        }
        try {
            return new URL(sb);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzK("Error closing http connection input stream", e);
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zzK("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(Typography.amp);
        }
        sb.append(URLEncoder.encode(str, Constants.DEFAULT_ENCODING));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, Constants.DEFAULT_ENCODING));
    }

    @VisibleForTesting
    public final String zza(zzex zzexVar, boolean z) {
        String valueOf;
        Preconditions.checkNotNull(zzexVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb, key, entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzexVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzexVar.zzb());
                }
                zzl(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzK("Failed to encode name or value", e);
            return null;
        }
    }

    @VisibleForTesting
    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
            zzw();
            httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0322 A[EDGE_INSN: B:177:0x0322->B:155:0x0322 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Long> zzc(List<zzex> list) {
        boolean z;
        boolean z2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection zzb;
        int size;
        int zzg;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        OutputStream outputStream2;
        byte[] byteArray;
        HttpURLConnection zzb2;
        OutputStream outputStream3;
        Object str;
        Ql9.m87996h();
        zzW();
        Preconditions.checkNotNull(list);
        if (!zzw().zza().isEmpty()) {
            zzfo zzfoVar = this.zzc;
            zzw();
            if (zzfoVar.zzc(zzeu.zzC.zzb().intValue() * 1000)) {
                zzw();
                String zzb3 = zzeu.zzv.zzb();
                if ("BATCH_BY_SESSION".equalsIgnoreCase(zzb3) || "BATCH_BY_TIME".equalsIgnoreCase(zzb3) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(zzb3) || "BATCH_BY_COUNT".equalsIgnoreCase(zzb3) || "BATCH_BY_SIZE".equalsIgnoreCase(zzb3)) {
                    z = true;
                } else {
                    z = false;
                }
                zzw();
                if (true == "GZIP".equalsIgnoreCase(zzeu.zzw.zzb())) {
                    z2 = true;
                    if (z) {
                        Preconditions.checkArgument(!list.isEmpty());
                        zzQ("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(list.size()));
                        zzfd zzfdVar = new zzfd(this);
                        ArrayList arrayList = new ArrayList();
                        for (zzex zzexVar : list) {
                            if (!zzfdVar.zzb(zzexVar)) {
                                break;
                            }
                            arrayList.add(Long.valueOf(zzexVar.zzb()));
                        }
                        if (zzfdVar.zza() != 0) {
                            URL zzh = zzh();
                            if (zzh == null) {
                                zzJ("Failed to build batching endpoint url");
                                return Collections.emptyList();
                            }
                            if (z2) {
                                byte[] zzc = zzfdVar.zzc();
                                Preconditions.checkNotNull(zzh);
                                Preconditions.checkNotNull(zzc);
                                try {
                                    zzo().getPackageName();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                    gZIPOutputStream.write(zzc);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    int length = byteArray.length;
                                    Object valueOf = Integer.valueOf(length);
                                    int length2 = zzc.length;
                                    zzI("POST compressed size, ratio %, url", valueOf, Long.valueOf((length * 100) / length2), zzh);
                                    if (length > length2) {
                                        zzT("Compressed payload is larger then uncompressed. compressed, uncompressed", valueOf, Integer.valueOf(length2));
                                    }
                                    if (zzbr.zzV()) {
                                        String str2 = new String(zzc);
                                        if (str2.length() != 0) {
                                            str = "\n".concat(str2);
                                        } else {
                                            str = new String("\n");
                                        }
                                        zzP("Post payload", str);
                                    }
                                    zzb2 = zzb(zzh);
                                    try {
                                        zzb2.setDoOutput(true);
                                        zzb2.addRequestProperty(Headers.CONTENT_ENCODING, "gzip");
                                        zzb2.setFixedLengthStreamingMode(length);
                                        zzb2.connect();
                                        outputStream3 = zzb2.getOutputStream();
                                    } catch (IOException e) {
                                        e = e;
                                        httpURLConnection3 = zzb2;
                                        outputStream2 = null;
                                        try {
                                            zzS("Network compressed POST connection error", e);
                                            if (outputStream2 != null) {
                                                try {
                                                    outputStream2.close();
                                                } catch (IOException e2) {
                                                    zzK("Error closing http compressed post connection output stream", e2);
                                                }
                                            }
                                            if (httpURLConnection3 != null) {
                                                httpURLConnection3.disconnect();
                                            }
                                            zzg = 0;
                                            if (zzg == 200) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            OutputStream outputStream4 = outputStream2;
                                            httpURLConnection2 = httpURLConnection3;
                                            outputStream = outputStream4;
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (IOException e3) {
                                                    zzK("Error closing http compressed post connection output stream", e3);
                                                }
                                            }
                                            if (httpURLConnection2 != null) {
                                                httpURLConnection2.disconnect();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        httpURLConnection2 = zzb2;
                                        outputStream = null;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    httpURLConnection3 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    outputStream = null;
                                    httpURLConnection2 = null;
                                }
                                try {
                                    outputStream3.write(byteArray);
                                    outputStream3.close();
                                    zzk(zzb2);
                                    int responseCode = zzb2.getResponseCode();
                                    if (responseCode == 200) {
                                        zzs().zzi();
                                        responseCode = 200;
                                    }
                                    zzG("POST status", Integer.valueOf(responseCode));
                                    zzb2.disconnect();
                                    zzg = responseCode;
                                } catch (IOException e5) {
                                    e = e5;
                                    httpURLConnection3 = zzb2;
                                    outputStream2 = outputStream3;
                                    zzS("Network compressed POST connection error", e);
                                    if (outputStream2 != null) {
                                    }
                                    if (httpURLConnection3 != null) {
                                    }
                                    zzg = 0;
                                    if (zzg == 200) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    httpURLConnection2 = zzb2;
                                    outputStream = outputStream3;
                                    th = th;
                                    if (outputStream != null) {
                                    }
                                    if (httpURLConnection2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                zzg = zzg(zzh, zzfdVar.zzc());
                            }
                            if (zzg == 200) {
                                zzP("Batched upload completed. Hits batched", Integer.valueOf(zzfdVar.zza()));
                                return arrayList;
                            }
                            Object valueOf2 = Integer.valueOf(zzg);
                            zzP("Network error uploading hits. status code", valueOf2);
                            if (zzw().zza().contains(valueOf2)) {
                                zzR("Server instructed the client to stop batching");
                                this.zzc.zzb();
                            }
                            return Collections.emptyList();
                        }
                        return arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList(list.size());
                    Iterator<zzex> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zzex next = it.next();
                        Preconditions.checkNotNull(next);
                        String zza2 = zza(next, !next.zzh());
                        if (zza2 == null) {
                            zzz().zzb(next, "Error formatting hit for upload");
                        } else {
                            int length3 = zza2.length();
                            zzw();
                            if (length3 <= zzeu.zzu.zzb().intValue()) {
                                URL zzj = zzj(next, zza2);
                                if (zzj == null) {
                                    zzJ("Failed to build collect GET endpoint url");
                                    break;
                                }
                                Preconditions.checkNotNull(zzj);
                                zzG("GET request", zzj);
                                try {
                                    zzb = zzb(zzj);
                                } catch (IOException e6) {
                                    e = e6;
                                    httpURLConnection = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    httpURLConnection = null;
                                }
                                try {
                                    zzb.connect();
                                    zzk(zzb);
                                    int responseCode2 = zzb.getResponseCode();
                                    if (responseCode2 == 200) {
                                        zzs().zzi();
                                        responseCode2 = 200;
                                    }
                                    zzG("GET status", Integer.valueOf(responseCode2));
                                    zzb.disconnect();
                                    if (responseCode2 != 200) {
                                        break;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    httpURLConnection = zzb;
                                    try {
                                        zzS("Network GET connection error", e);
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        return arrayList2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    httpURLConnection = zzb;
                                    if (httpURLConnection != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                String zza3 = zza(next, false);
                                if (zza3 == null) {
                                    zzz().zzb(next, "Error formatting hit for POST upload");
                                } else {
                                    byte[] bytes = zza3.getBytes();
                                    int length4 = bytes.length;
                                    zzw();
                                    if (length4 > zzeu.zzz.zzb().intValue()) {
                                        zzz().zzb(next, "Hit payload exceeds size limit");
                                    } else {
                                        URL zzi = zzi(next);
                                        if (zzi == null) {
                                            zzJ("Failed to build collect POST endpoint url");
                                            break;
                                        } else if (zzg(zzi, bytes) != 200) {
                                            break;
                                        }
                                    }
                                }
                                arrayList2.add(Long.valueOf(next.zzb()));
                                size = arrayList2.size();
                                zzw();
                                if (size >= zzct.zzh()) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(Long.valueOf(next.zzb()));
                        size = arrayList2.size();
                        zzw();
                        if (size >= zzct.zzh()) {
                        }
                    }
                    return arrayList2;
                }
                z2 = false;
                if (z) {
                }
            }
        }
        z = false;
        z2 = false;
        if (z) {
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        Ql9.m87996h();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
