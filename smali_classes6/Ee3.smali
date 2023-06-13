.class public final LEe3;
.super LL91;
.source "SourceFile"


# instance fields
.field public final b:LL91;

.field public final c:F


# direct methods
.method public constructor <init>(LL91;F)V
    .locals 0

    invoke-direct {p0}, LL91;-><init>()V

    iput-object p1, p0, LEe3;->b:LL91;

    iput p2, p0, LEe3;->c:F

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 1

    iget-object v0, p0, LEe3;->b:LL91;

    invoke-virtual {v0}, LL91;->d()Z

    move-result v0

    return v0
.end method

.method public e(FFFLvy5;)V
    .locals 2

    iget-object v0, p0, LEe3;->b:LL91;

    iget v1, p0, LEe3;->c:F

    sub-float/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3, p4}, LL91;->e(FFFLvy5;)V

    return-void
.end method
