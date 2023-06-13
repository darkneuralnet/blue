.class public final Lkx9;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:Lkx9;


# instance fields
.field private zzd:I

.field private zze:LRg7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkx9;

    invoke-direct {v0}, Lkx9;-><init>()V

    sput-object v0, Lkx9;->zza:Lkx9;

    const-class v1, Lkx9;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV78;-><init>()V

    return-void
.end method

.method public static synthetic H()Lkx9;
    .locals 1

    sget-object v0, Lkx9;->zza:Lkx9;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lkx9;->zza:Lkx9;

    return-object p1

    :cond_1
    new-instance p1, LIw9;

    invoke-direct {p1, p3}, LIw9;-><init>(LEv9;)V

    return-object p1

    :cond_2
    new-instance p1, Lkx9;

    invoke-direct {p1}, Lkx9;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lkx9;->zza:Lkx9;

    const-string p3, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000f\u1009\u0000"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
