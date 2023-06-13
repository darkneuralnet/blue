.class public LCV2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LEV2;

.field public b:I


# direct methods
.method public constructor <init>(LEV2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCV2;->a:LEV2;

    iput p2, p0, LCV2;->b:I

    return-void
.end method


# virtual methods
.method public a(LCV2;LWq5;)V
    .locals 3

    iget-object v0, p0, LCV2;->a:LEV2;

    iget v1, p0, LCV2;->b:I

    iget-object v2, p1, LCV2;->a:LEV2;

    iget p1, p1, LCV2;->b:I

    invoke-virtual {v0, v1, v2, p1, p2}, LEV2;->b(ILEV2;ILWq5;)V

    return-void
.end method
