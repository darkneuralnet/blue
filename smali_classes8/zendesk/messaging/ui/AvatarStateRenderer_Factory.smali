.class public final Lzendesk/messaging/ui/AvatarStateRenderer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/ui/AvatarStateRenderer;",
        ">;"
    }
.end annotation


# instance fields
.field private final picassoProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiT3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LiT3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;->picassoProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/messaging/ui/AvatarStateRenderer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LiT3;",
            ">;)",
            "Lzendesk/messaging/ui/AvatarStateRenderer_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(LiT3;)Lzendesk/messaging/ui/AvatarStateRenderer;
    .locals 1

    new-instance v0, Lzendesk/messaging/ui/AvatarStateRenderer;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/AvatarStateRenderer;-><init>(LiT3;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;->get()Lzendesk/messaging/ui/AvatarStateRenderer;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/ui/AvatarStateRenderer;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;->picassoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiT3;

    invoke-static {v0}, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;->newInstance(LiT3;)Lzendesk/messaging/ui/AvatarStateRenderer;

    move-result-object v0

    return-object v0
.end method
