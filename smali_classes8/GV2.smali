.class public LGV2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LAr2;

.field public b:LAr2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LAr2;

    invoke-direct {v0}, LAr2;-><init>()V

    iput-object v0, p0, LGV2;->a:LAr2;

    new-instance v0, LAr2;

    invoke-direct {v0}, LAr2;-><init>()V

    iput-object v0, p0, LGV2;->b:LAr2;

    return-void
.end method


# virtual methods
.method public a(LAr2;LAr2;)V
    .locals 0

    return-void
.end method

.method public b(LBV2;ILBV2;I)V
    .locals 1

    iget-object v0, p0, LGV2;->a:LAr2;

    invoke-virtual {p1, p2, v0}, LBV2;->f(ILAr2;)V

    iget-object p1, p0, LGV2;->b:LAr2;

    invoke-virtual {p3, p4, p1}, LBV2;->f(ILAr2;)V

    iget-object p1, p0, LGV2;->a:LAr2;

    iget-object p2, p0, LGV2;->b:LAr2;

    invoke-virtual {p0, p1, p2}, LGV2;->a(LAr2;LAr2;)V

    return-void
.end method
