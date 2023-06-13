.class public final Lzendesk/messaging/BelvedereMediaHolder_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/BelvedereMediaHolder_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/BelvedereMediaHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/messaging/BelvedereMediaHolder_Factory;
    .locals 1

    invoke-static {}, Lzendesk/messaging/BelvedereMediaHolder_Factory$InstanceHolder;->access$000()Lzendesk/messaging/BelvedereMediaHolder_Factory;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance()Lzendesk/messaging/BelvedereMediaHolder;
    .locals 1

    new-instance v0, Lzendesk/messaging/BelvedereMediaHolder;

    invoke-direct {v0}, Lzendesk/messaging/BelvedereMediaHolder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/BelvedereMediaHolder_Factory;->get()Lzendesk/messaging/BelvedereMediaHolder;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/BelvedereMediaHolder;
    .locals 1

    invoke-static {}, Lzendesk/messaging/BelvedereMediaHolder_Factory;->newInstance()Lzendesk/messaging/BelvedereMediaHolder;

    move-result-object v0

    return-object v0
.end method
