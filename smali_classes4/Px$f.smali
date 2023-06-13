.class public final LPx$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPx;-><init>([I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lv26;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lv26;",
        "b",
        "()Lv26;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LPx$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LPx$f;

    invoke-direct {v0}, LPx$f;-><init>()V

    sput-object v0, LPx$f;->g:LPx$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lv26;
    .locals 1

    new-instance v0, Lw26$a;

    invoke-direct {v0}, Lw26$a;-><init>()V

    invoke-virtual {v0}, Lw26$a;->a()Lw26;

    move-result-object v0

    invoke-static {v0}, Lu26;->a(Lx26;)Lv26;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPx$f;->b()Lv26;

    move-result-object v0

    return-object v0
.end method
