.class public final LpI6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoI6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LpI6;",
        "LoI6;",
        "",
        "url",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/ZendeskUrl;",
        "a",
        "LmI6;",
        "LmI6;",
        "client",
        "<init>",
        "(LmI6;)V",
        "zendesk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LmI6;


# direct methods
.method public constructor <init>(LmI6;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpI6;->a:LmI6;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/ZendeskUrl;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LpI6;->a:LmI6;

    new-instance v1, Lco/bird/api/request/ZendeskLoginRequestBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/ZendeskLoginRequestBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LmI6;->a(Lco/bird/api/request/ZendeskLoginRequestBody;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
