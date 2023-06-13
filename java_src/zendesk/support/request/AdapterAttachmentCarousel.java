package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import zendesk.support.suas.Dispatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class AdapterAttachmentCarousel extends RecyclerView.AbstractC11843h<CarouselViewHolder> {
    private static final int FILE_ATTACHMENT = 1;
    private static final int IMAGE_ATTACHMENT = 2;

    /* renamed from: af */
    private final ActionFactory f121973af;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final C42732iT3 picasso;
    private final CarouselViewHolder.OnRemoveListener removeListener = new CarouselViewHolder.OnRemoveListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.1
        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder.OnRemoveListener
        public void onRemove(StateRequestAttachment stateRequestAttachment) {
            AdapterAttachmentCarousel.this.dispatcher.dispatch(AdapterAttachmentCarousel.this.f121973af.deselectAttachment(Collections.singletonList(StateRequestAttachment.convert(stateRequestAttachment))));
        }
    };

    /* loaded from: classes8.dex */
    public static abstract class CarouselViewHolder extends RecyclerView.AbstractC11834D {

        /* loaded from: classes8.dex */
        public interface OnRemoveListener {
            void onRemove(StateRequestAttachment stateRequestAttachment);
        }

        public CarouselViewHolder(View view) {
            super(view);
        }

        public abstract void bind(StateRequestAttachment stateRequestAttachment, OnRemoveListener onRemoveListener);
    }

    /* loaded from: classes8.dex */
    public static class FileAttachmentViewHolder extends CarouselViewHolder {
        private final ImageView appIcon;
        private final TextView appName;
        private final View container;
        private final TextView name;
        private final View remove;

        public FileAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C52975zk4.zs_request_carousel_file, viewGroup, false));
            this.name = (TextView) this.itemView.findViewById(C35181Pg4.request_attachment_carousel_file_title);
            this.appIcon = (ImageView) this.itemView.findViewById(C35181Pg4.request_attachment_carousel_file_icon);
            this.appName = (TextView) this.itemView.findViewById(C35181Pg4.request_attachment_carousel_file_app_name);
            this.remove = this.itemView.findViewById(C35181Pg4.request_attachment_carousel_remove);
            this.container = this.itemView.findViewById(C35181Pg4.request_attachment_file_carousel_container);
        }

        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            Context context = this.itemView.getContext();
            ResolveInfo appInfoForFile = UtilsAttachment.getAppInfoForFile(context, stateRequestAttachment.getName());
            this.appIcon.setImageDrawable(UtilsAttachment.getAppIcon(context, appInfoForFile));
            this.appName.setText(UtilsAttachment.getAppName(context, appInfoForFile));
            this.name.setText(stateRequestAttachment.getName());
            this.remove.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.FileAttachmentViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            this.remove.setContentDescription(context.getString(C41720gl4.zs_request_attachment_carousel_remove_attachment_accessibility, stateRequestAttachment.getName()));
            this.container.setContentDescription(context.getString(C41720gl4.zs_request_attachment_carousel_attachment_accessibility, stateRequestAttachment.getName()));
        }
    }

    /* loaded from: classes8.dex */
    public static class ImageAttachmentViewHolder extends CarouselViewHolder {
        private final View container;
        private final ImageView imageView;
        private final C42732iT3 picasso;
        private final View remove;

        public ImageAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, C42732iT3 c42732iT3) {
            super(layoutInflater.inflate(C52975zk4.zs_request_carousel_image, viewGroup, false));
            this.imageView = (ImageView) this.itemView.findViewById(C35181Pg4.request_attachment_carousel_image);
            this.remove = this.itemView.findViewById(C35181Pg4.request_attachment_carousel_remove);
            this.container = this.itemView.findViewById(C35181Pg4.request_attachment_image_carousel_container);
            this.picasso = c42732iT3;
        }

        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            this.picasso.m33879j(stateRequestAttachment.getParsedLocalUri()).m107343d().m107346a().m107340g(this.imageView);
            this.remove.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.ImageAttachmentViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            Context context = this.itemView.getContext();
            this.remove.setContentDescription(context.getString(C41720gl4.zs_request_attachment_carousel_remove_attachment_accessibility, stateRequestAttachment.getName()));
            this.container.setContentDescription(context.getString(C41720gl4.zs_request_attachment_carousel_attachment_accessibility, stateRequestAttachment.getName()));
        }
    }

    public AdapterAttachmentCarousel(AttachmentHelper attachmentHelper, C42732iT3 c42732iT3, ActionFactory actionFactory, Dispatcher dispatcher) {
        this.attachmentHelper = attachmentHelper;
        this.picasso = c42732iT3;
        this.f121973af = actionFactory;
        this.dispatcher = dispatcher;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.attachmentHelper.getSelectedAttachments().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return this.attachmentHelper.getSelectedAttachments().get(i).getLocalUri().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (UtilsAttachment.isImageAttachment(this.attachmentHelper.getSelectedAttachments().get(i))) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(CarouselViewHolder carouselViewHolder, int i) {
        carouselViewHolder.bind(this.attachmentHelper.getSelectedAttachments().get(i), this.removeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public CarouselViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new ImageAttachmentViewHolder(from, viewGroup, this.picasso);
        }
        return new FileAttachmentViewHolder(from, viewGroup);
    }
}
