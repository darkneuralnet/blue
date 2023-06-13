.class public final Lp28;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg38;


# instance fields
.field public final synthetic a:Ljv9;


# direct methods
.method public constructor <init>(Ljv9;)V
    .locals 0

    iput-object p1, p0, Lp28;->a:Ljv9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(I)B
    .locals 1

    iget-object v0, p0, Lp28;->a:Ljv9;

    invoke-virtual {v0, p1}, Ljv9;->y(I)B

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lp28;->a:Ljv9;

    invoke-virtual {v0}, Ljv9;->size()I

    move-result v0

    return v0
.end method
