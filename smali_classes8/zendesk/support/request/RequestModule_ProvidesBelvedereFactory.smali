.class public final Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/belvedere/a;",
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;->contextProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;

    invoke-direct {v0, p0}, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static providesBelvedere(Landroid/content/Context;)Lzendesk/belvedere/a;
    .locals 0

    invoke-static {p0}, Lzendesk/support/request/RequestModule;->providesBelvedere(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/belvedere/a;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;->get()Lzendesk/belvedere/a;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/belvedere/a;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lzendesk/support/request/RequestModule_ProvidesBelvedereFactory;->providesBelvedere(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object v0

    return-object v0
.end method
