.class public final Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lokhttp3/OkHttpClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/support/SupportModule;


# direct methods
.method public constructor <init>(Lzendesk/support/SupportModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;->module:Lzendesk/support/SupportModule;

    return-void
.end method

.method public static create(Lzendesk/support/SupportModule;)Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;
    .locals 1

    new-instance v0, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;

    invoke-direct {v0, p0}, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;-><init>(Lzendesk/support/SupportModule;)V

    return-object v0
.end method

.method public static providesOkHttpClient(Lzendesk/support/SupportModule;)Lokhttp3/OkHttpClient;
    .locals 0

    invoke-virtual {p0}, Lzendesk/support/SupportModule;->providesOkHttpClient()Lokhttp3/OkHttpClient;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;->get()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public get()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;->module:Lzendesk/support/SupportModule;

    invoke-static {v0}, Lzendesk/support/SupportModule_ProvidesOkHttpClientFactory;->providesOkHttpClient(Lzendesk/support/SupportModule;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
