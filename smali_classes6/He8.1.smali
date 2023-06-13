.class public final LHe8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LHe8;


# instance fields
.field private zzd:Lqa8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHe8;

    invoke-direct {v0}, LHe8;-><init>()V

    sput-object v0, LHe8;->zza:LHe8;

    const-class v1, LHe8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, LHe8;->zzd:Lqa8;

    return-void
.end method

.method public static H()LB68;
    .locals 1

    sget-object v0, LHe8;->zza:LHe8;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, LB68;

    return-object v0
.end method

.method public static synthetic I()LHe8;
    .locals 1

    sget-object v0, LHe8;->zza:LHe8;

    return-object v0
.end method

.method public static synthetic J(LHe8;LiQ7;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LHe8;->zzd:Lqa8;

    invoke-interface {v0}, Lqa8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LV78;->r(Lqa8;)Lqa8;

    move-result-object v0

    iput-object v0, p0, LHe8;->zzd:Lqa8;

    :cond_0
    iget-object p0, p0, LHe8;->zzd:Lqa8;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
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
    sget-object p1, LHe8;->zza:LHe8;

    return-object p1

    :cond_1
    new-instance p1, LB68;

    invoke-direct {p1, p3}, LB68;-><init>(LrY7;)V

    return-object p1

    :cond_2
    new-instance p1, LHe8;

    invoke-direct {p1}, LHe8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, LiQ7;

    aput-object p3, p1, p2

    sget-object p2, LHe8;->zza:LHe8;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
