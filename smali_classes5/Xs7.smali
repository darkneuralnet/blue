.class public interface abstract LXs7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h0:LXs7;

.field public static final i0:LXs7;

.field public static final j0:LXs7;

.field public static final k0:LXs7;

.field public static final l0:LXs7;

.field public static final m0:LXs7;

.field public static final n0:LXs7;

.field public static final o0:LXs7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LXw7;

    invoke-direct {v0}, LXw7;-><init>()V

    sput-object v0, LXs7;->h0:LXs7;

    new-instance v0, Lqr7;

    invoke-direct {v0}, Lqr7;-><init>()V

    sput-object v0, LXs7;->i0:LXs7;

    new-instance v0, Lnl7;

    const-string v1, "continue"

    invoke-direct {v0, v1}, Lnl7;-><init>(Ljava/lang/String;)V

    sput-object v0, LXs7;->j0:LXs7;

    new-instance v0, Lnl7;

    const-string v1, "break"

    invoke-direct {v0, v1}, Lnl7;-><init>(Ljava/lang/String;)V

    sput-object v0, LXs7;->k0:LXs7;

    new-instance v0, Lnl7;

    const-string v1, "return"

    invoke-direct {v0, v1}, Lnl7;-><init>(Ljava/lang/String;)V

    sput-object v0, LXs7;->l0:LXs7;

    new-instance v0, Lsk7;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lsk7;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, LXs7;->m0:LXs7;

    new-instance v0, Lsk7;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lsk7;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, LXs7;->n0:LXs7;

    new-instance v0, Liw7;

    const-string v1, ""

    invoke-direct {v0, v1}, Liw7;-><init>(Ljava/lang/String;)V

    sput-object v0, LXs7;->o0:LXs7;

    return-void
.end method


# virtual methods
.method public abstract j()Ljava/util/Iterator;
.end method

.method public abstract o(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;
.end method

.method public abstract zzd()LXs7;
.end method

.method public abstract zzg()Ljava/lang/Boolean;
.end method

.method public abstract zzh()Ljava/lang/Double;
.end method

.method public abstract zzi()Ljava/lang/String;
.end method
