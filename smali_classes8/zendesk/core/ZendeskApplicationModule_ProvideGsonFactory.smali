.class public final Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LoE1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory$InstanceHolder;->access$000()Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory;

    move-result-object v0

    return-object v0
.end method

.method public static provideGson()LoE1;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule;->provideGson()LoE1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoE1;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory;->get()LoE1;

    move-result-object v0

    return-object v0
.end method

.method public get()LoE1;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule_ProvideGsonFactory;->provideGson()LoE1;

    move-result-object v0

    return-object v0
.end method
