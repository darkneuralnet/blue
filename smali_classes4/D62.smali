.class public abstract enum LD62;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LD62;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LD62;

.field public static final enum c:LD62;

.field public static final enum d:LD62;

.field public static final enum e:LD62;

.field public static final enum f:LD62;

.field public static final enum g:LD62;

.field public static final enum h:LD62;

.field public static final enum i:LD62;

.field public static final synthetic j:[LD62;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LD62$a;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LD62$a;-><init>(Ljava/lang/String;ILC62;)V

    sput-object v0, LD62;->b:LD62;

    new-instance v0, LD62$b;

    const-string v1, "OVERSHOOT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, LD62$b;-><init>(Ljava/lang/String;ILE62;)V

    sput-object v0, LD62;->c:LD62;

    new-instance v0, LD62$c;

    const-string v1, "ACCELERATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, LD62$c;-><init>(Ljava/lang/String;ILF62;)V

    sput-object v0, LD62;->d:LD62;

    new-instance v0, LD62$d;

    const-string v1, "DECELERATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, LD62$d;-><init>(Ljava/lang/String;ILG62;)V

    sput-object v0, LD62;->e:LD62;

    new-instance v0, LD62$e;

    const-string v1, "ACCELERATE_DECELERATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, LD62$e;-><init>(Ljava/lang/String;ILH62;)V

    sput-object v0, LD62;->f:LD62;

    new-instance v0, LD62$f;

    const-string v1, "HESITATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, LD62$f;-><init>(Ljava/lang/String;ILI62;)V

    sput-object v0, LD62;->g:LD62;

    new-instance v0, LD62$g;

    const-string v1, "FAST_SLOW"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v3}, LD62$g;-><init>(Ljava/lang/String;ILJ62;)V

    sput-object v0, LD62;->h:LD62;

    new-instance v0, LD62$h;

    const-string v1, "ELASTIC"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v3}, LD62$h;-><init>(Ljava/lang/String;ILK62;)V

    sput-object v0, LD62;->i:LD62;

    invoke-static {}, LD62;->a()[LD62;

    move-result-object v0

    sput-object v0, LD62;->j:[LD62;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILL62;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LD62;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[LD62;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [LD62;

    const/4 v1, 0x0

    sget-object v2, LD62;->b:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LD62;->c:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LD62;->d:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LD62;->e:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LD62;->f:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LD62;->g:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LD62;->h:LD62;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LD62;->i:LD62;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LD62;
    .locals 1

    const-class v0, LD62;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LD62;

    return-object p0
.end method

.method public static values()[LD62;
    .locals 1

    sget-object v0, LD62;->j:[LD62;

    invoke-virtual {v0}, [LD62;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LD62;

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/view/animation/Interpolator;
.end method
