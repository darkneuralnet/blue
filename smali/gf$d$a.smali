.class public Lgf$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgf$d;-><init>(Lgf$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lgf$d;


# direct methods
.method public constructor <init>(Lgf$d;)V
    .locals 0

    iput-object p1, p0, Lgf$d$a;->b:Lgf$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 0

    iget-object p1, p0, Lgf$d$a;->b:Lgf$d;

    iget-object p1, p1, Lgf$c;->a:Lgf$a;

    invoke-virtual {p1}, Lgf$a;->a()V

    return-void
.end method
