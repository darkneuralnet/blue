.class public LX64$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyv5$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX64;->p(Landroidx/camera/core/impl/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/impl/d;

.field public final synthetic b:LX64;


# direct methods
.method public constructor <init>(LX64;Landroidx/camera/core/impl/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LX64$c;->b:LX64;

    iput-object p2, p0, LX64$c;->a:Landroidx/camera/core/impl/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
