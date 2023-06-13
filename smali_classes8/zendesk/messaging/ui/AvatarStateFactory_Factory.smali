.class public final Lzendesk/messaging/ui/AvatarStateFactory_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/ui/AvatarStateFactory_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/ui/AvatarStateFactory;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/messaging/ui/AvatarStateFactory_Factory;
    .locals 1

    invoke-static {}, Lzendesk/messaging/ui/AvatarStateFactory_Factory$InstanceHolder;->access$000()Lzendesk/messaging/ui/AvatarStateFactory_Factory;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance()Lzendesk/messaging/ui/AvatarStateFactory;
    .locals 1

    new-instance v0, Lzendesk/messaging/ui/AvatarStateFactory;

    invoke-direct {v0}, Lzendesk/messaging/ui/AvatarStateFactory;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/ui/AvatarStateFactory_Factory;->get()Lzendesk/messaging/ui/AvatarStateFactory;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/ui/AvatarStateFactory;
    .locals 1

    invoke-static {}, Lzendesk/messaging/ui/AvatarStateFactory_Factory;->newInstance()Lzendesk/messaging/ui/AvatarStateFactory;

    move-result-object v0

    return-object v0
.end method
