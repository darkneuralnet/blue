.class public final Landroidx/compose/ui/platform/h$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LuY1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LuY1;",
        "b",
        "()LuY1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Landroidx/compose/ui/platform/h$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/h$c;

    invoke-direct {v0}, Landroidx/compose/ui/platform/h$c;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/h$c;->g:Landroidx/compose/ui/platform/h$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LuY1;
    .locals 1

    const-string v0, "LocalImageVectorCache"

    invoke-static {v0}, Landroidx/compose/ui/platform/h;->e(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/h$c;->b()LuY1;

    move-result-object v0

    return-object v0
.end method
