.class public final LaR7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LaR7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lqa8;

.field private zzg:Lie8;

.field private zzh:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LaR7;

    invoke-direct {v0}, LaR7;-><init>()V

    sput-object v0, LaR7;->zza:LaR7;

    const-class v1, LaR7;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LaR7;->zzh:B

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, LaR7;->zzf:Lqa8;

    return-void
.end method

.method public static synthetic H()LaR7;
    .locals 1

    sget-object v0, LaR7;->zza:LaR7;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LaR7;->zzh:B

    return-object v3

    :cond_1
    sget-object p1, LaR7;->zza:LaR7;

    return-object p1

    :cond_2
    new-instance p1, LHO7;

    invoke-direct {p1, v3}, LHO7;-><init>(LrO7;)V

    return-object p1

    :cond_3
    new-instance p1, LaR7;

    invoke-direct {p1}, LaR7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    sget-object p2, LlP7;->a:Lf98;

    aput-object p2, p1, v4

    const-string p2, "zzf"

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    sget-object p2, LaR7;->zza:LaR7;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u001a\u0003\u1409\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LaR7;->zzh:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LaR7;->zzf:Lqa8;

    return-object v0
.end method

.method public final J()I
    .locals 1

    iget v0, p0, LaR7;->zze:I

    invoke-static {v0}, LKQ7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
