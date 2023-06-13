.class public final Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/RequestSessionCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/support/StorageModule;


# direct methods
.method public constructor <init>(Lzendesk/support/StorageModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;->module:Lzendesk/support/StorageModule;

    return-void
.end method

.method public static create(Lzendesk/support/StorageModule;)Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;
    .locals 1

    new-instance v0, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;

    invoke-direct {v0, p0}, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;-><init>(Lzendesk/support/StorageModule;)V

    return-object v0
.end method

.method public static provideRequestSessionCache(Lzendesk/support/StorageModule;)Lzendesk/support/RequestSessionCache;
    .locals 0

    invoke-virtual {p0}, Lzendesk/support/StorageModule;->provideRequestSessionCache()Lzendesk/support/RequestSessionCache;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/RequestSessionCache;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;->get()Lzendesk/support/RequestSessionCache;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/RequestSessionCache;
    .locals 1

    iget-object v0, p0, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;->module:Lzendesk/support/StorageModule;

    invoke-static {v0}, Lzendesk/support/StorageModule_ProvideRequestSessionCacheFactory;->provideRequestSessionCache(Lzendesk/support/StorageModule;)Lzendesk/support/RequestSessionCache;

    move-result-object v0

    return-object v0
.end method
