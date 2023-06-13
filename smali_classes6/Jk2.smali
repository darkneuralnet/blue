.class public final LJk2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJk2$b;
    }
.end annotation


# instance fields
.field public final a:LKk2;


# direct methods
.method public constructor <init>(LKk2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJk2;->a:LKk2;

    return-void
.end method

.method public static a(Ljava/lang/String;[BLJk2$b;)LJk2;
    .locals 2

    new-instance v0, LJk2;

    invoke-static {}, LKk2;->N()LKk2$b;

    move-result-object v1

    invoke-virtual {v1, p0}, LKk2$b;->z(Ljava/lang/String;)LKk2$b;

    move-result-object p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {p0, p1}, LKk2$b;->A(Lcom/google/crypto/tink/shaded/protobuf/g;)LKk2$b;

    move-result-object p0

    invoke-static {p2}, LJk2;->c(LJk2$b;)LeA3;

    move-result-object p1

    invoke-virtual {p0, p1}, LKk2$b;->y(LeA3;)LKk2$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LKk2;

    invoke-direct {v0, p0}, LJk2;-><init>(LKk2;)V

    return-object v0
.end method

.method public static c(LJk2$b;)LeA3;
    .locals 1

    sget-object v0, LJk2$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, LeA3;->g:LeA3;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, LeA3;->f:LeA3;

    return-object p0

    :cond_2
    sget-object p0, LeA3;->e:LeA3;

    return-object p0

    :cond_3
    sget-object p0, LeA3;->d:LeA3;

    return-object p0
.end method


# virtual methods
.method public b()LKk2;
    .locals 1

    iget-object v0, p0, LJk2;->a:LKk2;

    return-object v0
.end method
