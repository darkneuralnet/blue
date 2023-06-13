.class public Lgp2$b;
.super LJE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgp2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LeA3;


# direct methods
.method public constructor <init>(Ljava/lang/String;LeA3;)V
    .locals 0

    invoke-direct {p0}, LJE3;-><init>()V

    iput-object p1, p0, Lgp2$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lgp2$b;->b:LeA3;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LeA3;Lgp2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lgp2$b;-><init>(Ljava/lang/String;LeA3;)V

    return-void
.end method

.method public static a(LeA3;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lgp2$a;->a:[I

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

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN"

    return-object p0

    :cond_0
    const-string p0, "CRUNCHY"

    return-object p0

    :cond_1
    const-string p0, "RAW"

    return-object p0

    :cond_2
    const-string p0, "LEGACY"

    return-object p0

    :cond_3
    const-string p0, "TINK"

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lgp2$b;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-object v1, p0, Lgp2$b;->b:LeA3;

    invoke-static {v1}, Lgp2$b;->a(LeA3;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "(typeUrl=%s, outputPrefixType=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
