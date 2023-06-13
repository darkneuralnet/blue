.class public final LHB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGB5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0003\u0018\u00002\u00020\u0001BR\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012<\u0010\u0013\u001a8\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00050\r\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J+\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000c\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000bRP\u0010\u0013\u001a8\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00050\r8\u0006\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "LHB5;",
        "LGB5;",
        "LG52;",
        "initialSize",
        "targetSize",
        "Ltm1;",
        "b",
        "(JJ)Ltm1;",
        "",
        "a",
        "Z",
        "()Z",
        "clip",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlin/jvm/functions/Function2;",
        "getSizeAnimationSpec",
        "()Lkotlin/jvm/functions/Function2;",
        "sizeAnimationSpec",
        "<init>",
        "(ZLkotlin/jvm/functions/Function2;)V",
        "animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LG52;",
            "LG52;",
            "Ltm1<",
            "LG52;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LG52;",
            "-",
            "LG52;",
            "+",
            "Ltm1<",
            "LG52;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "sizeAnimationSpec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LHB5;->a:Z

    iput-object p2, p0, LHB5;->b:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LHB5;->a:Z

    return v0
.end method

.method public b(JJ)Ltm1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ltm1<",
            "LG52;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHB5;->b:Lkotlin/jvm/functions/Function2;

    invoke-static {p1, p2}, LG52;->b(J)LG52;

    move-result-object p1

    invoke-static {p3, p4}, LG52;->b(J)LG52;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltm1;

    return-object p1
.end method
