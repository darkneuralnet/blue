.class public final LTq9;
.super Lyv9;
.source "SourceFile"


# instance fields
.field public final synthetic i:Lvs9;


# direct methods
.method public constructor <init>(Lvs9;LCw9;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LTq9;->i:Lvs9;

    invoke-direct {p0, p2, p3}, Lyv9;-><init>(LCw9;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final d(I)I
    .locals 4

    iget-object v0, p0, LTq9;->i:Lvs9;

    iget-object v0, v0, Lvs9;->a:LA99;

    iget-object v1, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-string v3, "index"

    invoke-static {p1, v2, v3}, LUo9;->b(IILjava/lang/String;)I

    :goto_0
    if-ge p1, v2, :cond_0

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, LA99;->a(C)Z

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :cond_1
    return p1
.end method
