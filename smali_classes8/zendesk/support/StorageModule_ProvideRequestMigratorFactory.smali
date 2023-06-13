.class public final Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/RequestMigrator;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/StorageModule;


# direct methods
.method public constructor <init>(Lzendesk/support/StorageModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/StorageModule;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->module:Lzendesk/support/StorageModule;

    iput-object p2, p0, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->contextProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/StorageModule;LY94;)Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/StorageModule;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;-><init>(Lzendesk/support/StorageModule;LY94;)V

    return-object v0
.end method

.method public static provideRequestMigrator(Lzendesk/support/StorageModule;Landroid/content/Context;)Lzendesk/support/RequestMigrator;
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/support/StorageModule;->provideRequestMigrator(Landroid/content/Context;)Lzendesk/support/RequestMigrator;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/RequestMigrator;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->get()Lzendesk/support/RequestMigrator;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/RequestMigrator;
    .locals 2

    iget-object v0, p0, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->module:Lzendesk/support/StorageModule;

    iget-object v1, p0, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->contextProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lzendesk/support/StorageModule_ProvideRequestMigratorFactory;->provideRequestMigrator(Lzendesk/support/StorageModule;Landroid/content/Context;)Lzendesk/support/RequestMigrator;

    move-result-object v0

    return-object v0
.end method
