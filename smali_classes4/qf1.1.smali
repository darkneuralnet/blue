.class public final Lqf1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "",
        "a",
        "LZj2;",
        "b",
        "gson_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    new-instance v0, Lco/bird/gson/android/typeadapters/DuplicateSerializedNameException;

    invoke-direct {v0, p0}, Lco/bird/gson/android/typeadapters/DuplicateSerializedNameException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic access$throwDuplicate(Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Lqf1;->a(Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toKey(Ljava/lang/String;)LZj2;
    .locals 0

    invoke-static {p0}, Lqf1;->b(Ljava/lang/String;)LZj2;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)LZj2;
    .locals 1

    sget-object v0, LZj2;->b:LZj2$a;

    invoke-virtual {v0, p0}, LZj2$a;->a(Ljava/lang/String;)LZj2;

    move-result-object p0

    return-object p0
.end method
