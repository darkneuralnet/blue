.class public final LYD8;
.super LTR8;
.source "SourceFile"


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 0

    invoke-direct {p0, p1}, LTR8;-><init>(LhV8;)V

    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
