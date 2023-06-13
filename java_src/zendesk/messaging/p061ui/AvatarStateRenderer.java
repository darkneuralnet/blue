package zendesk.messaging.p061ui;

import zendesk.messaging.R$drawable;
/* renamed from: zendesk.messaging.ui.AvatarStateRenderer */
/* loaded from: classes8.dex */
class AvatarStateRenderer {
    private static final int DEFAULT_AVATAR_DRAWABLE = R$drawable.zui_ic_default_avatar_16;
    private final C42732iT3 picasso;

    public AvatarStateRenderer(C42732iT3 c42732iT3) {
        this.picasso = c42732iT3;
    }

    public void render(AvatarState avatarState, AvatarView avatarView) {
        if (C44504lS5.m27273b(avatarState.getAvatarUrl())) {
            avatarView.showImage(this.picasso, avatarState.getAvatarUrl());
        } else if (avatarState.getAvatarRes() != null) {
            avatarView.showDrawable(avatarState.getAvatarRes().intValue());
        } else if (C44504lS5.m27273b(avatarState.getAvatarLetter()) && avatarState.getAvatarLetter().matches("[a-zA-Z]")) {
            avatarView.showLetter(avatarState.getAvatarLetter(), avatarState.getUniqueIdentifier());
        } else {
            avatarView.showDefault(DEFAULT_AVATAR_DRAWABLE, avatarState.getUniqueIdentifier());
        }
    }
}
