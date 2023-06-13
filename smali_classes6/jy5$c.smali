.class public final Ljy5$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Liy5;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/RectF;

.field public final d:Ljy5$b;

.field public final e:F


# direct methods
.method public constructor <init>(Liy5;FLandroid/graphics/RectF;Ljy5$b;Landroid/graphics/Path;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ljy5$c;->d:Ljy5$b;

    iput-object p1, p0, Ljy5$c;->a:Liy5;

    iput p2, p0, Ljy5$c;->e:F

    iput-object p3, p0, Ljy5$c;->c:Landroid/graphics/RectF;

    iput-object p5, p0, Ljy5$c;->b:Landroid/graphics/Path;

    return-void
.end method
