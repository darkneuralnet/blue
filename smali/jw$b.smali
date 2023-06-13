.class public final Ljw$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LjD3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljw;->h0(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "jw$b",
        "LjD3$b;",
        "",
        "m",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,471:1\n81#2:472\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n*L\n193#1:472\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljw;


# direct methods
.method public constructor <init>(Ljw;)V
    .locals 0

    iput-object p1, p0, Ljw$b;->b:Ljw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 2

    iget-object v0, p0, Ljw$b;->b:Ljw;

    invoke-static {v0}, Ljw;->e0(Ljw;)Lnm2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljw$b;->b:Ljw;

    const/16 v1, 0x80

    invoke-static {v1}, LK83;->a(I)I

    move-result v1

    invoke-static {v0, v1}, LwZ0;->g(LvZ0;I)LH83;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljw;->t(Lnm2;)V

    :cond_0
    return-void
.end method
