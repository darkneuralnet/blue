.class public final LiY8;
.super LAY8;
.source "SourceFile"


# static fields
.field public static final j:LiY8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LiY8;

    const-string v1, "unusedTag"

    invoke-direct {v0, v1}, LiY8;-><init>(Ljava/lang/String;)V

    sput-object v0, LiY8;->j:LiY8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string p1, "unusedTag"

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LAY8;-><init>(Ljava/lang/String;LrY8;)V

    return-void
.end method

.method public static bridge synthetic f()LiY8;
    .locals 1

    sget-object v0, LiY8;->j:LiY8;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()LAY8;
    .locals 0

    return-object p0
.end method

.method public final b(J)V
    .locals 0

    return-void
.end method

.method public final c(J)V
    .locals 0

    return-void
.end method

.method public final close()V
    .locals 0

    return-void
.end method
