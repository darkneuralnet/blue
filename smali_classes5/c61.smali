.class public abstract Lc61;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc61$g;,
        Lc61$c;,
        Lc61$f;,
        Lc61$b;,
        Lc61$a;,
        Lc61$d;,
        Lc61$e;
    }
.end annotation


# static fields
.field public static final a:Lc61;

.field public static final b:Lc61;

.field public static final c:Lc61;

.field public static final d:Lc61;

.field public static final e:Lc61;

.field public static final f:Lc61;

.field public static final g:Lc61;

.field public static final h:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "Lc61;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc61$a;

    invoke-direct {v0}, Lc61$a;-><init>()V

    sput-object v0, Lc61;->a:Lc61;

    new-instance v0, Lc61$b;

    invoke-direct {v0}, Lc61$b;-><init>()V

    sput-object v0, Lc61;->b:Lc61;

    new-instance v0, Lc61$e;

    invoke-direct {v0}, Lc61$e;-><init>()V

    sput-object v0, Lc61;->c:Lc61;

    new-instance v0, Lc61$c;

    invoke-direct {v0}, Lc61$c;-><init>()V

    sput-object v0, Lc61;->d:Lc61;

    new-instance v0, Lc61$d;

    invoke-direct {v0}, Lc61$d;-><init>()V

    sput-object v0, Lc61;->e:Lc61;

    new-instance v1, Lc61$f;

    invoke-direct {v1}, Lc61$f;-><init>()V

    sput-object v1, Lc61;->f:Lc61;

    sput-object v0, Lc61;->g:Lc61;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    invoke-static {v1, v0}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, Lc61;->h:Liy3;

    const/4 v0, 0x1

    sput-boolean v0, Lc61;->i:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(IIII)Lc61$g;
.end method

.method public abstract b(IIII)F
.end method
