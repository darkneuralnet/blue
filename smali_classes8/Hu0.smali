.class public LHu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LHu0;->a:I

    iput v0, p0, LHu0;->b:I

    iput v0, p0, LHu0;->c:I

    sget v0, Lgf4;->scale_with_alpha:I

    iput v0, p0, LHu0;->d:I

    const/4 v0, 0x0

    iput v0, p0, LHu0;->e:I

    sget v1, LFg4;->white_radius:I

    iput v1, p0, LHu0;->f:I

    iput v0, p0, LHu0;->h:I

    const/16 v0, 0x11

    iput v0, p0, LHu0;->i:I

    return-void
.end method
