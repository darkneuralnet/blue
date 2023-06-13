.class public final Lz08;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lq18;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lq18;->b:Lq18;

    iput-object v0, p0, Lz08;->b:Lq18;

    return-void
.end method


# virtual methods
.method public final a(I)Lz08;
    .locals 0

    iput p1, p0, Lz08;->a:I

    return-object p0
.end method

.method public final b()LD18;
    .locals 3

    new-instance v0, Lk08;

    iget v1, p0, Lz08;->a:I

    iget-object v2, p0, Lz08;->b:Lq18;

    invoke-direct {v0, v1, v2}, Lk08;-><init>(ILq18;)V

    return-object v0
.end method
