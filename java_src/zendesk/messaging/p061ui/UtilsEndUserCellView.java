package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Set;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$string;
import zendesk.messaging.p061ui.MessagePopUpHelper;
/* renamed from: zendesk.messaging.ui.UtilsEndUserCellView */
/* loaded from: classes8.dex */
class UtilsEndUserCellView {
    private static final int ERROR_BACKGROUND = R$drawable.zui_background_cell_errored;
    private static final int FILE_BACKGROUND = R$drawable.zui_background_cell_file;
    private static final int USER_MESSAGE_BACKGROUND = R$drawable.zui_background_end_user_cell;
    private static final int TAP_TO_RETRY = R$string.zui_label_tap_retry;
    private static final int EXCEEDING_MAX_FILE_SIZE = R$string.zui_message_log_message_file_exceeds_max_size;
    private static final int ATTACHMENTS_NOT_SUPPORTED = R$string.zui_message_log_message_attachments_not_supported;
    private static final int ATTACHMENT_TYPE_NOT_SUPPORTED = R$string.zui_message_log_message_attachment_type_not_supported;
    private static final int ATTACHMENT_COULD_NOT_BE_SENT = R$string.zui_message_log_attachment_sending_failed;
    private static final int ERROR_BACKGROUND_COLOR = R$color.zui_error_background_color;
    private static final int PENDING_COLOR = R$color.zui_color_white_60;

    /* renamed from: zendesk.messaging.ui.UtilsEndUserCellView$5 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C312455 {

        /* renamed from: $SwitchMap$zendesk$messaging$MessagingItem$FileQuery$FailureReason */
        static final /* synthetic */ int[] f121938xccb8eb41;
        static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$MessagingItem$Query$Status;

        static {
            int[] iArr = new int[MessagingItem.Query.Status.values().length];
            $SwitchMap$zendesk$messaging$MessagingItem$Query$Status = iArr;
            try {
                iArr[MessagingItem.Query.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED_NO_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.DELIVERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MessagingItem.FileQuery.FailureReason.values().length];
            f121938xccb8eb41 = iArr2;
            try {
                iArr2[MessagingItem.FileQuery.FailureReason.FILE_SIZE_TOO_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f121938xccb8eb41[MessagingItem.FileQuery.FailureReason.FILE_SENDING_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f121938xccb8eb41[MessagingItem.FileQuery.FailureReason.UNSUPPORTED_FILE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private UtilsEndUserCellView() {
    }

    private static String getAttachmentLabelErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        if (endUserCellFileState.getStatus() == MessagingItem.Query.Status.FAILED) {
            return context.getString(TAP_TO_RETRY);
        }
        return getAttachmentNonRetryableErrorMessage(endUserCellFileState, context);
    }

    private static String getAttachmentNonRetryableErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        String string = context.getString(ATTACHMENT_COULD_NOT_BE_SENT);
        if (endUserCellFileState.getFailureReason() == null) {
            return string;
        }
        int i = C312455.f121938xccb8eb41[endUserCellFileState.getFailureReason().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return string;
                }
                return context.getString(ATTACHMENT_TYPE_NOT_SUPPORTED);
            }
            return context.getString(ATTACHMENTS_NOT_SUPPORTED);
        } else if (endUserCellFileState.getAttachmentSettings() != null) {
            return context.getString(EXCEEDING_MAX_FILE_SIZE, UtilsAttachment.formatFileSize(context, endUserCellFileState.getAttachmentSettings().getMaxFileSize()));
        } else {
            return string;
        }
    }

    public static Drawable getImageLoadingPlaceholder(Context context) {
        int m115422e = C31646Ad6.m115422e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        int m115422e2 = C31646Ad6.m115422e(R$attr.colorPrimaryDark, context, R$color.zui_color_primary_dark);
        float dimension = context.getResources().getDimension(R$dimen.zui_cell_bubble_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{m115422e2, m115422e, m115422e2});
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<MessagePopUpHelper.Option> getMenuOptions(MessagingItem.Query.Status status) {
        HashSet hashSet = new HashSet(2);
        if (status == MessagingItem.Query.Status.FAILED) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
            hashSet.add(MessagePopUpHelper.Option.RETRY);
        } else if (status == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
        }
        return hashSet;
    }

    public static boolean isFailedCell(EndUserCellBaseState endUserCellBaseState) {
        MessagingItem.Query.Status status = endUserCellBaseState.getStatus();
        if (status != MessagingItem.Query.Status.FAILED && status != MessagingItem.Query.Status.FAILED_NO_RETRY) {
            return false;
        }
        return true;
    }

    private static void setAttachmentClickListener(final EndUserCellFileState endUserCellFileState, View view) {
        int i = C312455.$SwitchMap$zendesk$messaging$MessagingItem$Query$Status[endUserCellFileState.getStatus().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.UtilsEndUserCellView.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            EndUserCellFileState.this.getAttachment();
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.UtilsEndUserCellView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (EndUserCellFileState.this.getMessageActionListener() != null) {
                        EndUserCellFileState.this.getMessageActionListener().retry(EndUserCellFileState.this.getId());
                    }
                }
            });
            return;
        }
        view.setOnClickListener(null);
    }

    public static void setCellBackground(EndUserCellBaseState endUserCellBaseState, View view) {
        if (isFailedCell(endUserCellBaseState)) {
            view.setBackgroundResource(ERROR_BACKGROUND);
        } else if (endUserCellBaseState instanceof EndUserCellFileState) {
            view.setBackgroundResource(FILE_BACKGROUND);
        } else {
            Drawable m94299e = NA0.m94299e(view.getContext(), USER_MESSAGE_BACKGROUND);
            if (m94299e != null) {
                m94299e.setColorFilter(new PorterDuffColorFilter(C31646Ad6.m115422e(R$attr.colorPrimary, view.getContext(), R$color.zui_color_primary), PorterDuff.Mode.SRC_ATOP));
                view.setBackground(m94299e);
                return;
            }
            C33694Ix2.m101447l("UtilsEndUserCellView", "Failed to set background, resource R.drawable.zui_background_end_user_cell could not be found", new Object[0]);
        }
    }

    public static void setClickListener(EndUserCellBaseState endUserCellBaseState, View view) {
        if (endUserCellBaseState instanceof EndUserCellMessageState) {
            setMessageClickListener((EndUserCellMessageState) endUserCellBaseState, view);
        } else if (endUserCellBaseState instanceof EndUserCellFileState) {
            setAttachmentClickListener((EndUserCellFileState) endUserCellBaseState, view);
        }
    }

    public static void setImageViewColorFilter(EndUserCellBaseState endUserCellBaseState, ImageView imageView, Context context) {
        if (isFailedCell(endUserCellBaseState)) {
            imageView.setColorFilter(C31646Ad6.m115425b(ERROR_BACKGROUND_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else if (endUserCellBaseState.getStatus() == MessagingItem.Query.Status.PENDING) {
            imageView.setColorFilter(C31646Ad6.m115425b(PENDING_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else {
            imageView.clearColorFilter();
        }
    }

    public static void setLabelErrorMessage(EndUserCellBaseState endUserCellBaseState, TextView textView, Context context) {
        if (!isFailedCell(endUserCellBaseState)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (endUserCellBaseState instanceof EndUserCellFileState) {
            textView.setText(getAttachmentLabelErrorMessage((EndUserCellFileState) endUserCellBaseState, context));
        } else {
            textView.setText(context.getString(TAP_TO_RETRY));
        }
    }

    public static void setLongClickListener(final EndUserCellBaseState endUserCellBaseState, final View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: zendesk.messaging.ui.UtilsEndUserCellView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                MessagePopUpHelper.showPopUpMenu(view, UtilsEndUserCellView.getMenuOptions(endUserCellBaseState.getStatus()), endUserCellBaseState.getMessageActionListener(), endUserCellBaseState.getId());
                return true;
            }
        });
    }

    private static void setMessageClickListener(final EndUserCellMessageState endUserCellMessageState, View view) {
        if (endUserCellMessageState.getStatus() == MessagingItem.Query.Status.FAILED || endUserCellMessageState.getStatus() == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.UtilsEndUserCellView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (EndUserCellMessageState.this.getMessageActionListener() != null) {
                        EndUserCellMessageState.this.getMessageActionListener().retry(EndUserCellMessageState.this.getId());
                    }
                }
            });
        }
    }
}
