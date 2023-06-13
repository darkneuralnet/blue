.class public final LZp5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp5;->i(LgV2;LrX2;LEy3;ZLaq5;Lcu1;LDA3;ZLEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LjX3;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:LZp5$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZp5$f;

    invoke-direct {v0}, LZp5$f;-><init>()V

    sput-object v0, LZp5$f;->g:LZp5$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LjX3;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "down"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LjX3;->l()I

    move-result p1

    sget-object v0, LyX3;->a:LyX3$a;

    invoke-virtual {v0}, LyX3$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LyX3;->g(II)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LjX3;

    invoke-virtual {p0, p1}, LZp5$f;->a(LjX3;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
