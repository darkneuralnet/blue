.class public Lgk2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:F

.field public c:F

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>(IFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgk2$c;->a:I

    iput p5, p0, Lgk2$c;->b:F

    iput p3, p0, Lgk2$c;->c:F

    iput p2, p0, Lgk2$c;->d:F

    iput p4, p0, Lgk2$c;->e:F

    return-void
.end method
