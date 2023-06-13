.class public final LIE1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0012\u001a\u0004\u0008\u0003\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "LIE1;",
        "",
        "LMW1;",
        "b",
        "LMW1;",
        "c",
        "()LMW1;",
        "f",
        "(LMW1;)V",
        "imageBitmap",
        "Lme0;",
        "Lme0;",
        "a",
        "()Lme0;",
        "d",
        "(Lme0;)V",
        "canvas",
        "Loe0;",
        "Loe0;",
        "()Loe0;",
        "e",
        "(Loe0;)V",
        "canvasDrawScope",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LIE1;

.field public static b:LMW1;

.field public static c:Lme0;

.field public static d:Loe0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIE1;

    invoke-direct {v0}, LIE1;-><init>()V

    sput-object v0, LIE1;->a:LIE1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lme0;
    .locals 1

    sget-object v0, LIE1;->c:Lme0;

    return-object v0
.end method

.method public final b()Loe0;
    .locals 1

    sget-object v0, LIE1;->d:Loe0;

    return-object v0
.end method

.method public final c()LMW1;
    .locals 1

    sget-object v0, LIE1;->b:LMW1;

    return-object v0
.end method

.method public final d(Lme0;)V
    .locals 0

    sput-object p1, LIE1;->c:Lme0;

    return-void
.end method

.method public final e(Loe0;)V
    .locals 0

    sput-object p1, LIE1;->d:Loe0;

    return-void
.end method

.method public final f(LMW1;)V
    .locals 0

    sput-object p1, LIE1;->b:LMW1;

    return-void
.end method
