.class public final Lbn7;
.super Lll7;
.source "SourceFile"


# annotations
.annotation runtime Lorg/jspecify/nullness/NullMarked;
.end annotation


# static fields
.field public static final f:Lll7;


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbn7;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lbn7;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lbn7;->f:Lll7;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lll7;-><init>()V

    iput-object p1, p0, Lbn7;->d:[Ljava/lang/Object;

    iput p2, p0, Lbn7;->e:I

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lbn7;->d:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, Lbn7;->e:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lbn7;->e:I

    return p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lbn7;->e:I

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbn7;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LUo9;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lbn7;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbn7;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lbn7;->e:I

    return v0
.end method
