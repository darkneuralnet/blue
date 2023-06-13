.class public final LNX1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNX1$b;,
        LNX1$a;,
        LNX1$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0003\t\u000bB3\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000f\u001a\u0004\u0008\u0003\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\t\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016\u00a8\u0006 "
    }
    d2 = {
        "LNX1;",
        "",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "Landroid/net/Uri;",
        "b",
        "Landroid/net/Uri;",
        "c",
        "()Landroid/net/Uri;",
        "imageUri",
        "LNX1$b;",
        "LNX1$b;",
        "()LNX1$b;",
        "callback",
        "",
        "d",
        "Z",
        "getAllowCachedRedirects",
        "()Z",
        "allowCachedRedirects",
        "e",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "callerTag",
        "isCachedRedirectAllowed",
        "<init>",
        "(Landroid/content/Context;Landroid/net/Uri;LNX1$b;ZLjava/lang/Object;)V",
        "f",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final f:LNX1$c;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/net/Uri;

.field public final c:LNX1$b;

.field public final d:Z

.field public final e:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LNX1$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LNX1$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LNX1;->f:LNX1$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;LNX1$b;ZLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNX1;->a:Landroid/content/Context;

    iput-object p2, p0, LNX1;->b:Landroid/net/Uri;

    iput-object p3, p0, LNX1;->c:LNX1$b;

    iput-boolean p4, p0, LNX1;->d:Z

    iput-object p5, p0, LNX1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/net/Uri;LNX1$b;ZLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LNX1;-><init>(Landroid/content/Context;Landroid/net/Uri;LNX1$b;ZLjava/lang/Object;)V

    return-void
.end method

.method public static final d(Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LNX1;->f:LNX1$c;

    invoke-virtual {v0, p0, p1, p2, p3}, LNX1$c;->a(Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()LNX1$b;
    .locals 1

    iget-object v0, p0, LNX1;->c:LNX1$b;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNX1;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, LNX1;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LNX1;->d:Z

    return v0
.end method
