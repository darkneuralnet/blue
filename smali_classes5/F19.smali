.class public final LF19;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lj29;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj29;->b:Lj29;

    iput-object v0, p0, LF19;->b:Lj29;

    return-void
.end method


# virtual methods
.method public final a(I)LF19;
    .locals 0

    iput p1, p0, LF19;->a:I

    return-object p0
.end method

.method public final b()Lt29;
    .locals 3

    new-instance v0, Lv19;

    iget v1, p0, LF19;->a:I

    iget-object v2, p0, LF19;->b:Lj29;

    invoke-direct {v0, v1, v2}, Lv19;-><init>(ILj29;)V

    return-object v0
.end method
