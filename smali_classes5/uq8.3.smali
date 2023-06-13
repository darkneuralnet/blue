.class public final Luq8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:Luq8;


# instance fields
.field private zzd:LNV8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Luq8;

    invoke-direct {v0}, Luq8;-><init>()V

    sput-object v0, Luq8;->zza:Luq8;

    const-class v1, Luq8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, Luq8;->zzd:LNV8;

    return-void
.end method

.method public static synthetic C()Luq8;
    .locals 1

    sget-object v0, Luq8;->zza:Luq8;

    return-object v0
.end method

.method public static D()Luq8;
    .locals 1

    sget-object v0, Luq8;->zza:Luq8;

    return-object v0
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Luq8;->zza:Luq8;

    return-object p1

    :cond_1
    new-instance p1, Lrq8;

    invoke-direct {p1, p3}, Lrq8;-><init>(LXp8;)V

    return-object p1

    :cond_2
    new-instance p1, Luq8;

    invoke-direct {p1}, Luq8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, LVq8;

    aput-object p3, p1, p2

    sget-object p2, Luq8;->zza:Luq8;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, LpU8;->t(Lr19;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final B()I
    .locals 1

    iget-object v0, p0, Luq8;->zzd:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Luq8;->zzd:LNV8;

    return-object v0
.end method
