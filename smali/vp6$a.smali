.class public final Lvp6$a;
.super Lvp6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvp6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final c:LfA3;

.field public final d:I

.field public final e:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lvp6;-><init>(LdA3;LNs4;)V

    iput-object p3, p0, Lvp6$a;->c:LfA3;

    iput p4, p0, Lvp6$a;->d:I

    iput-object p5, p0, Lvp6$a;->e:Ljava/lang/Throwable;

    return-void
.end method

.method public static g(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "ERROR_NO_VALID_DATA"

    return-object p0

    :pswitch_1
    const-string p0, "ERROR_RECORDER_ERROR"

    return-object p0

    :pswitch_2
    const-string p0, "ERROR_ENCODING_FAILED"

    return-object p0

    :pswitch_3
    const-string p0, "ERROR_INVALID_OUTPUT_OPTIONS"

    return-object p0

    :pswitch_4
    const-string p0, "ERROR_SOURCE_INACTIVE"

    return-object p0

    :pswitch_5
    const-string p0, "ERROR_INSUFFICIENT_STORAGE"

    return-object p0

    :pswitch_6
    const-string p0, "ERROR_FILE_SIZE_LIMIT_REACHED"

    return-object p0

    :pswitch_7
    const-string p0, "ERROR_UNKNOWN"

    return-object p0

    :pswitch_8
    const-string p0, "ERROR_NONE"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public h()I
    .locals 1

    iget v0, p0, Lvp6$a;->d:I

    return v0
.end method

.method public i()Z
    .locals 1

    iget v0, p0, Lvp6$a;->d:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
