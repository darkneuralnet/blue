.class public final LNI8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LNI8;


# instance fields
.field private zzd:I

.field private zze:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LNI8;

    invoke-direct {v0}, LNI8;-><init>()V

    sput-object v0, LNI8;->zza:LNI8;

    const-class v1, LNI8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV78;-><init>()V

    return-void
.end method

.method public static synthetic H()LNI8;
    .locals 1

    sget-object v0, LNI8;->zza:LNI8;

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
    sget-object p1, LNI8;->zza:LNI8;

    return-object p1

    :cond_1
    new-instance p1, LBI8;

    invoke-direct {p1, p3}, LBI8;-><init>(Ley8;)V

    return-object p1

    :cond_2
    new-instance p1, LNI8;

    invoke-direct {p1}, LNI8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, LNI8;->zza:LNI8;

    const-string p3, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
