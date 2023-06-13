package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.stripe.android.financialconnections.domain.Entry;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.support.IdUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class UtilsAttachment {
    private static final String ATTACHMENT_SEPARATOR = ", ";
    private static final String ATTACHMENT_TEXT_BODY = "[%s]";
    private static final String PATH_PLACEHOLDER = "%s%s%s";
    private static final AttachmentNameComparator REQUEST_ATTACHMENT_COMPARATOR;
    private static final String REQUEST_BELVEDERE_PATH;
    private static final String SUPPORT_BELVEDERE_BASE_PATH;

    /* loaded from: classes8.dex */
    public static class AttachmentNameComparator implements Comparator<StateRequestAttachment> {
        private AttachmentNameComparator() {
        }

        @Override // java.util.Comparator
        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getName().compareTo(stateRequestAttachment2.getName());
        }
    }

    static {
        Locale locale = Locale.US;
        String str = File.separator;
        String format = String.format(locale, PATH_PLACEHOLDER, "zendesk", str, "support");
        SUPPORT_BELVEDERE_BASE_PATH = format;
        REQUEST_BELVEDERE_PATH = String.format(locale, PATH_PLACEHOLDER, format, str, "request");
        REQUEST_ATTACHMENT_COMPARATOR = new AttachmentNameComparator();
    }

    private UtilsAttachment() {
    }

    public static Drawable getAppIcon(Context context, ResolveInfo resolveInfo) {
        Drawable drawable;
        if (resolveInfo != null) {
            drawable = resolveInfo.loadIcon(context.getPackageManager());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return NA0.m94299e(context, 17301651);
    }

    public static ResolveInfo getAppInfoForFile(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        MediaResult m763d = C31096a.m764c(context).m763d("tmp", str);
        if (m763d == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m763d.m779j());
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (C43505jm0.m29950g(queryIntentActivities)) {
            return null;
        }
        return queryIntentActivities.get(0);
    }

    public static CharSequence getAppName(Context context, ResolveInfo resolveInfo) {
        CharSequence charSequence;
        if (resolveInfo != null) {
            charSequence = resolveInfo.loadLabel(context.getPackageManager());
        } else {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return context.getString(C41720gl4.request_attachment_generic_unknown_app);
    }

    public static String getAttachmentSubDir(String str, long j) {
        return String.format(Locale.US, PATH_PLACEHOLDER, str, File.separator, Long.valueOf(j));
    }

    public static String getCacheDirForRequestId(String str) {
        return String.format(Locale.US, PATH_PLACEHOLDER, REQUEST_BELVEDERE_PATH, File.separator, str);
    }

    public static String getContentDescriptionForAttachmentButton(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C41720gl4.request_menu_button_label_add_attachments));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(C41720gl4.zs_request_attachment_indicator_no_attachments_selected_accessibility));
        } else if (i == 1) {
            sb.append(context.getString(C41720gl4.zs_request_attachment_indicator_one_attachments_selected_accessibility));
        } else {
            sb.append(context.getString(C41720gl4.zs_request_attachment_indicator_n_attachments_selected_accessibility, Integer.valueOf(i)));
        }
        return sb.toString();
    }

    public static MediaResult getLocalFile(C31096a c31096a, String str, long j, String str2) {
        return c31096a.m763d(getAttachmentSubDir(getCacheDirForRequestId(str), j), str2);
    }

    public static String getMessageBodyForAttachments(List<StateRequestAttachment> list) {
        List m29954c = C43505jm0.m29954c(list);
        Collections.sort(m29954c, REQUEST_ATTACHMENT_COMPARATOR);
        StringBuilder sb = new StringBuilder();
        int size = m29954c.size();
        for (int i = 0; i < size; i++) {
            sb.append(((StateRequestAttachment) m29954c.get(i)).getName());
            if (i < size - 1) {
                sb.append(ATTACHMENT_SEPARATOR);
            }
        }
        return String.format(Locale.US, ATTACHMENT_TEXT_BODY, sb.toString());
    }

    public static String getTemporaryRequestCacheDir() {
        return String.format(Locale.US, PATH_PLACEHOLDER, REQUEST_BELVEDERE_PATH, File.separator, IdUtil.newStringId());
    }

    public static boolean hasAttachmentBody(StateMessage stateMessage) {
        if (C43505jm0.m29948i(stateMessage.getAttachments())) {
            return stateMessage.getBody().equals(getMessageBodyForAttachments(stateMessage.getAttachments()));
        }
        return false;
    }

    public static boolean isImageAttachment(StateRequestAttachment stateRequestAttachment) {
        String mimeType = stateRequestAttachment.getMimeType();
        if (C44504lS5.m27273b(mimeType) && mimeType.toLowerCase(Locale.US).startsWith(Entry.TYPE_IMAGE)) {
            return true;
        }
        return false;
    }
}
